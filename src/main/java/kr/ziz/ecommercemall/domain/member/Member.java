package kr.ziz.ecommercemall.domain.member;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Entity
@NoArgsConstructor
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String memberId;
    private String memberNm;
    private String memberPw;
    private String phoneNo;
    private String email;
    private String authKey;
    private Boolean authYn;

    @Builder
    public Member(String memberId, String memberNm, String memberPw
            , String phoneNo, String email, String authKey, Boolean authYn) {
        // valid
        // TODO 패스워드 암호화
        // authKey 생성, authYn =N

        this.memberId = memberId;
        this.memberNm = memberNm;
        this.memberPw = memberPw;
        this.phoneNo = phoneNo;
        this.email = email;
        this.authKey = authKey;
        this.authYn = false;
    }

}