package com.board.example.dao;
 
import java.util.List;
 
 
import com.board.example.dto.BoardDTO;
 
public interface BoardDAO {
    // �Խù� ��� ����
    public List<BoardDTO> boardList() throws Exception;
}
