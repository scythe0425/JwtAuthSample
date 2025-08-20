package com.example;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.Scanner;

public class JwtTokenGenerator {
    public static void main(String[] args) {
        // 시크릿 키 및 만료시간 설정
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        long EXPIRATION_TIME = 1000 * 60 * 60; // 1시간

        // 사용자 id 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("userId를 입력하세요: ");
        String userId = sc.nextLine();

        String token = Jwts.builder()
                .setSubject(userId) // 실제 유저 식별 필드를 넣어줌
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key)
                .compact();

        System.out.println("\n생성된 JWT 토큰:\n" + token);
        System.out.println("\n시크릿키(base64):\n" + java.util.Base64.getEncoder().encodeToString(key.getEncoded()));
        System.out.println("\n시크릿 키 만료 시간: \n "+ EXPIRATION_TIME/(1000 * 60 * 60)+" 시간" );
        sc.close();
    }
}
