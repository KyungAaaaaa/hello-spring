package hello.core.member;

public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;

	// MemoryMemberRepository 에 관한 내용이 존재하지 않는다 : *추상화에만 의존*
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}

	//테스트 용도
	public MemberRepository getMemberRepository() {
		return memberRepository;
	}
}
