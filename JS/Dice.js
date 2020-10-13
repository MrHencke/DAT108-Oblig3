class Dice {
	constructor(value) {
		this.value = value;
	}

	roll() {
		return (this.value = 1 + Math.floor(Math.random() * 6));
	}

	getValue() {
		return this.value;
	}
}
export default Dice;
