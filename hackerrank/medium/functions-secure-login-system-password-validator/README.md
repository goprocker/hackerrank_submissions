# Functions - Secure Login System Password Validator

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine a web application development scenario where you are responsible for implementing a secure login system. As part of this, you need to enforce specific rules to ensure that users set strong and secure passwords. The security team has provided you with password validation rules to protect against unauthorized access.

Your task is to create a function that checks if a given password is valid based on these rules. This function will help users choose secure passwords and prevent common vulnerabilities in the application.

 **Function Description** 

int CheckPassword(char str[], int n);

The function accepts a string str of size n as an argument and returns 1 if the given string str is a valid password and 0 otherwise. A valid password must satisfy the following conditions:

- The password must be at least 4 characters long.
- It must contain at least one numeric digit.
- It must contain at least one uppercase letter.
- It must not contain any spaces or slashes (/).
- The first character of the password must not be a number.

 **Assumption** 

The input string will not be empty.

 **Input Format** 

A single string str that represents the password to be validated.

 **Constraints** 

The password will be a non-empty string containing alphanumeric characters and special characters.

 **Output Format** 

- Return 1 if the password is valid.
- Return 0 if the password is invalid.

 **Sample Input 0** 

```
aA1_67

```

 **Sample Output 0** 

```
1

```

 **Explanation 0** 

The password aA1_67 is valid because:

- It is at least 4 characters long.
- It contains at least one numeric digit (1).
- It contains at least one uppercase letter (A).
- It does not contain spaces or /.
- The first character is not a number.

 **Sample Input 1** 

```
A987 abC012

```

 **Sample Output 1** 

```
0

```

 **Explanation 1** 

The password A987 abC012 is invalid because:

- It contains a space. Thus, the function returns 0.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T04:34:50.326Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static int CheckPassword(char[] str, int n) {
        if (str == null || n < 4) return 0;
        if (Character.isDigit(str[0])) return 0;
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < n; i++) {
            char c = str[i];
            if (c == ' ' || c == '/') return 0;
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
        }
        return hasDigit && hasUpper ? 1 : 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) s = "";
        System.out.print(CheckPassword(s.toCharArray(), s.length()));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functions-secure-login-system-password-validator/problem)