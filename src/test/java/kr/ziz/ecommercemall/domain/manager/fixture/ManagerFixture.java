package kr.ziz.ecommercemall.domain.manager.fixture;

import kr.ziz.ecommercemall.domain.common.Address;
import kr.ziz.ecommercemall.domain.manager.Manager;

public class ManagerFixture {
  public static Manager createManager(String managerPw) {
    return new Manager("managerId", "managerNm", managerPw
            , "email", "N", "bizNo", new Address(), "");
  }
}