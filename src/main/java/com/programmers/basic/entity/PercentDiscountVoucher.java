package com.programmers.basic.entity;

import java.util.UUID;

public class PercentDiscountVoucher implements Voucher {

	private final UUID voucherId;
	private final long percent;

	public PercentDiscountVoucher(UUID voucherId, long percent) {
		this.voucherId = voucherId;
		this.percent = percent;
	}

	@Override
	public UUID getVoucherId() {
		return voucherId;
	}

	@Override
	public String toString() {
		return "PercentDiscountVoucher{" +
			"voucherId=" + voucherId +
			", percent=" + percent +
			'}';
	}

}