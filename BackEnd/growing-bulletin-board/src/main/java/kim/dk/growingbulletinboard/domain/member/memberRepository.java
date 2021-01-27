package kim.dk.growingbulletinboard.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<Member,Long> {
}
