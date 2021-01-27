package kim.dk.growingbulletinboard.service;

import kim.dk.growingbulletinboard.domain.board.Board;
import kim.dk.growingbulletinboard.domain.member.Member;
import kim.dk.growingbulletinboard.service.dto.BoardDTO;

public interface boardService {
    void register(BoardDTO dto);

    void get(Board board);

    void delete(Long bno);

    void modify(BoardDTO boardDTO);

    default Board dtoToEntity(BoardDTO dto){
        Member member= Member.builder().email(dto.getWriterEmail()).build();

        Board board = Board.builder()
                .bno(dto.getBno())
                .content(dto.getContent())
                .title(dto.getTitle())
                .member(member)
                .build();
        return board;
    }

    default BoardDTO EntityToDTO(Board board,Member member,int replyCount){

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(board.getBno())
                .content(board.getContent())
                .modDate(board.getModDate())
                .regDate(board.getRegDate())
                .writerEmail(member.getEmail())
                .replyCount(replyCount)
                .build();
        return boardDTO;
    }
}
