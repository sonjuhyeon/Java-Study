package variable;

public class Var7 {
  // 정수
  // 1byte 2^8 range(-128 ~ 127)
  byte b = 127;
  // 2byte 2^16 range(-32,768 ~ 32,767)
  short s = 32767;
  // 4byte 2^32 range(-2,147,483,648 ~ 2,147,483,647)
  int i = 2_147_483_647;
  // 8byte 2^64 range(-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
  long l = 9_223_372_036_854_775_807L; // 뒤에 'L' 또는 'l'을 붙여야 함

  // 실수
  // float`: 대략 -3.4E38 ~ 3.4E38, 7자리 정밀도 (4byte, 2³²)
  float f = 10.0f; // 뒤에 'f' 붙여야 함
  // `double`:  대략 -1.7E308 ~ 1.7E308, 15자리 정밀도 (8byte, 2⁶⁴)
  double d = 10.0;
}
