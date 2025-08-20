# JwtAuthSample
jwt 토큰 생성 실습, 예소 api 구현용


이 프로젝트는 스프링 부트 기반의 JWT(Json Web Token) 인증 실습용 샘플입니다.
사용자 별 고유 식별자인 userID를 토큰에 포함시켜, 인증된 사용자만 자신의 정보를 안전하게 요청할 수 있도록 구현.

---

### 주요 기능
- JWT 토큰 생성 및 검증
- 로그인 시 userID를 포함한 JWT 토큰 발급
- API 요청 시 토큰 인증 및 사용자별 데이터 조회
- `/api/community/question/my` 엔드포인트 구현 예제 - 토큰에서 추출한 userID로 본인 질문 리스트 조회
