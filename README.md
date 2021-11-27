# Thymeleaf layout dialect 테스트

- 상황 : 프로젝트 작업 시 layout:fragment 내용이 적용 되지 않는 문제로 테스트
- 원인 : 인텔리제이 작업 시 Gradle task로 layout dialect의 빌드가 제대로 되지 않았다.
- 해결 : CMD로 직접 프로젝트 경로로 접근하여 gradlew clean build 명령어를 진행한 후 실행 시 정상적으로 layout 적용이 되었다.
