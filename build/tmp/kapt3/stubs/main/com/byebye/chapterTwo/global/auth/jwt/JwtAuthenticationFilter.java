package com.byebye.chapterTwo.global.auth.jwt;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/byebye/chapterTwo/global/auth/jwt/JwtAuthenticationFilter;", "Lorg/springframework/web/filter/OncePerRequestFilter;", "jwtUtils", "Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/byebye/chapterTwo/global/auth/jwt/JwtUtils;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "doFilterInternal", "", "request", "Ljakarta/servlet/http/HttpServletRequest;", "response", "Ljakarta/servlet/http/HttpServletResponse;", "filterChain", "Ljakarta/servlet/FilterChain;", "setErrorResponse", "errorCode", "Lcom/byebye/chapterTwo/global/auth/jwt/exception/JwtErrorCode;", "chapterTwo"})
public final class JwtAuthenticationFilter extends org.springframework.web.filter.OncePerRequestFilter {
    @org.jetbrains.annotations.NotNull()
    private final com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public JwtAuthenticationFilter(@org.jetbrains.annotations.NotNull()
    com.byebye.chapterTwo.global.auth.jwt.JwtUtils jwtUtils, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @java.lang.Override()
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull()
    jakarta.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    jakarta.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    jakarta.servlet.FilterChain filterChain) {
    }
    
    private final void setErrorResponse(jakarta.servlet.http.HttpServletResponse response, com.byebye.chapterTwo.global.auth.jwt.exception.JwtErrorCode errorCode) {
    }
}