package com.board.example.service;
 
import java.util.List;
 
 
import com.board.example.dto.BoardDTO;
 
public interface BoardService {
    // �Խù� ��� ��ȸ
    public List<BoardDTO> boardList() throws Exception;
}
