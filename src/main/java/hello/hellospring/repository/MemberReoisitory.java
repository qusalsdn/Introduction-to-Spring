package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberReoisitory {
    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> String(String name);

    List<Member> findAll();
}
