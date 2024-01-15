package com.board.jooboard.boardDao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.jooboard.board.vo.Board;


@Mapper
public interface BoardDao {
	
	// 게시글 등록
	void insert(Board board);
}
