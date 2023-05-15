package kr.ziz.ecommercemall.domain.member;

public interface MemberService {
    MemberInfo registerMember(MemberCommand.RegisterMember memberCommand);

    MemberInfo modifyMember(String memberToken, MemberCommand.ModifyMember memberCommand);

    void deleteMember(String memberToken);

    void issueOtp(String memberToken);
}
