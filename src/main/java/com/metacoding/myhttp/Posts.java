package com.metacoding.myhttp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// annotation = JVM이 읽어들이는 주석.
// Runtime(실행)시 JVM이 읽어들여서, 주석의 내용을 실행한다. (Getter의 내용.)
public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;
}
