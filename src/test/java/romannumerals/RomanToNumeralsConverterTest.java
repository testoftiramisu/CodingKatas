package romannumerals;

import org.junit.jupiter.api.Test;

class RomanToNumeralsConverterTest {

  RomanToNumeralsConverter converter;

  @Test
  public void convertICharacterToOne() {
    assertThat(converter.convert("I")).isEqualTo(1);
  }

}