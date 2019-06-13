package com.board.example.dto;

import java.util.Date;

public class BoardDTO {
    //Field
    private int bno;        //�Խù���ȣ
    private String title;    //�Խù�����
    private String content;    //�Խù�����
    private String writer;    //�Խù��ۼ���
    private Date regdate;    //�Խù��ۼ�����
    private int viewcnt;    //�Խù���ȸ��
    
    //Constructor
    public BoardDTO() {}
    public BoardDTO(int bno, String title, String content, String writer, Date regdate, int viewcnt) {
        super();
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regdate = regdate;
        this.viewcnt = viewcnt;
    }
    
    //getter & setter
    public int getBno() {
        return bno;
    }
    public void setBno(int bno) {
        this.bno = bno;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public int getViewcnt() {
        return viewcnt;
    }
    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }
 
    //toString
    @Override
    public String toString() {
        return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
                + ", regdate=" + regdate + ", viewcnt=" + viewcnt + "]";
    }
 
}