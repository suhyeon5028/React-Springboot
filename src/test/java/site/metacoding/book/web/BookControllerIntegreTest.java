package site.metacoding.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

// 통합 테스트 (모든 Bean들을 똑같이 Ioc에 올리고 테스트 하는 것)
// WebEnvironment.MOCK = 실제 톰켓을 올리는게 아니라, 모의로 테스트
// WebEnvironment.RANDOM_PORT = 실제 톰켓으로 테스트
// @AutoConfigureWebMvc MockMvc를 Ioc에 등록해줌
// @Transactional 각각의 테스트함수가 종료될 때마다 트랜잭션을 rollback 해주는 어노테이션

@Transactional
@AutoConfigureWebMvc
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class BookControllerIntegreTest {
    
    @Autowired
    private MockMvc mockMvc;
}
