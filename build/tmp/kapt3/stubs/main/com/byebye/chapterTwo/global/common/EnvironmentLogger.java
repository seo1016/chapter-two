package com.byebye.chapterTwo.global.common;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/byebye/chapterTwo/global/common/EnvironmentLogger;", "", "()V", "dbPassword", "", "dbUrl", "dbUsername", "logEnvironment", "", "chapterTwo"})
public class EnvironmentLogger {
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.url}")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dbUrl = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.username}")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dbUsername = null;
    @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.password}")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dbPassword = null;
    
    public EnvironmentLogger() {
        super();
    }
    
    @jakarta.annotation.PostConstruct()
    public void logEnvironment() {
    }
}