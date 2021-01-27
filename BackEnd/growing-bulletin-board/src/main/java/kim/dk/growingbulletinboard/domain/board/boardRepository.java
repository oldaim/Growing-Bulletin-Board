package kim.dk.growingbulletinboard.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface boardRepository extends JpaRepository<Board,Long> {
}
