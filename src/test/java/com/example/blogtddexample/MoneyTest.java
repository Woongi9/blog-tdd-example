package com.example.blogtddexample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.blogtddexample.entity.Dollar;

@SpringBootTest
public class MoneyTest {

	@DisplayName("달러 곱셈 단위 테스트")
	@Test
	void moneyMultiply() {
		Dollar fiveDollar = new Dollar(5);

		Dollar product = fiveDollar.times(2);
		assertThat(product).isEqualTo(new Dollar(10));
		product = fiveDollar.times(3);
		assertThat(product).isEqualTo(new Dollar(15));
	}

	@DisplayName("equals 단위 테스트")
	@Test
	void equals() {
		assertThat(new Dollar(5).equals(new Dollar(5))).isTrue();
		assertThat(new Dollar(5).equals(new Dollar(6))).isFalse();
	}
}
