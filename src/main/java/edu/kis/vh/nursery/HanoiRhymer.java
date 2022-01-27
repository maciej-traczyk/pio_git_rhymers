package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	@Override
	public int getTotal() {
		return super.getTotal();
	}

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

//źle sformatowane były wiersze o numerze 5, 12, 14, 15
//skrót alt <- / alt -> przełaczaja akutalnie otwarte karty lewo/prawo