package site.metacoding.book.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository 적어야 스프링 Ioc에 빈으로 등록이 되는데
// JpaRepository를 extends하면 생략 가능함.
// JpaRepository는 CRUD함수를 들고 있음.
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
