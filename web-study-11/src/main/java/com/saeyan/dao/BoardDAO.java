package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.BoardVO;

import util.DBMenager;

public class BoardDAO {
	
	private static BoardDAO instance= new BoardDAO();
	
	private BoardDAO() {
		
	}
	
	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board order by num desc";
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			
			con = DBMenager.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			/*
			    num  int
				pass	varchar(30)
				name	varchar(30)
				email	varchar(30)
				title	varchar(50)
				content	varchar(1000)
				readcount	int
				writedate	datetime
			 */
			while(rs.next()) {
				
				BoardVO vo = new BoardVO();
				
				int num = rs.getInt("num");
				
				String name = rs.getString("name");
				
				vo.setNum(num);
				vo.setName(name);
				vo.setPass(rs.getString("pass"));
				vo.setEmail(rs.getString("email"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setReadcount(rs.getString("readcount"));
				vo.setWritedate(rs.getTimestamp("writedate"));		
				
				list.add(vo);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBMenager.close(con,pstmt,rs);
		}
		return list;
	}

	public void insertBoard(BoardVO vo) {
		
		String sql = "insert into board(name, pass, email, title, content)"
				+"values(?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			DBMenager.getConnection();
			con = DBMenager.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getTitle());
			pstmt.setString(5, vo.getContent());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBMenager.close(con,pstmt);
		}
		
	}

public BoardVO selectOneByNum(int num) {
		
		BoardVO vo = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board where num = ?";
		try {
			
			con = DBMenager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				rs.getInt("num");
//				rs.getString("name");
//				rs.getString("pass");
//				rs.getString("email");
//				rs.getString("title");
//				rs.getString("content");
//				rs.getInt("readcount");
//				rs.getTimestamp("writedate");
				
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setPass(rs.getString("pass"));
				vo.setEmail(rs.getString("email"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setReadcount(rs.getString("readcount"));
				vo.setWritedate(rs.getTimestamp("writedate"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBMenager.close(con, pstmt, rs);
		}		
		return vo;
}



	

}
