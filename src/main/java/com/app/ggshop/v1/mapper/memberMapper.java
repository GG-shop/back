package com.app.ggshop.v1.mapper;

import com.app.ggshop.v1.domain.MemberVO;
import com.app.ggshop.v1.domain.OAuthVO;
import com.app.ggshop.v1.dto.MemberDTO;

import java.util.Optional;

@Mapper
public interface memberMapper {
    //    아이디 검사
    public Optional<MemberDTO> selectByMemberEmail(String memberEmail);
    //    회원가입
    public void insert(MemberDTO memberDTO);
    //    oauth
    public void insertOauth(OAuthVO oAuthVO);
    //    로그인
    public Optional<MemberVO> selectMemberForLogin(MemberDTO memberDTO);
}
