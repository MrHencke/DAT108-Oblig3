import Dice from "./Dice.js";

class DiceController extends Dice {
	constructor(run) {
		super();
		this.run = this.run.bind(this);
	}

	run() {
		const btRef = document
			.getElementById("root")
			.querySelector("*[data-dicebutton]");
		btRef.addEventListener("click", function () {
			let dice = new Dice();
			const spanRef = document
				.getElementById("root")
				.querySelector("*[data-diceoutput]");
			dice.roll();
			spanRef.innerHTML = `<br><img src='${
				faces[dice.value - 1]
			}'> <br> Verdi: ${dice.value}`;
		});
		console.log("This is being run");
	}
}

const controller = new DiceController("root");
document.addEventListener("DOMContentLoaded", controller.run, true);

const faces = [
	"https://upload.wikimedia.org/wikipedia/commons/2/2c/Alea_1.png",
	"https://upload.wikimedia.org/wikipedia/commons/b/b8/Alea_2.png",
	"https://upload.wikimedia.org/wikipedia/commons/2/2f/Alea_3.png",
	"https://upload.wikimedia.org/wikipedia/commons/8/8d/Alea_4.png",
	"https://upload.wikimedia.org/wikipedia/commons/5/55/Alea_5.png",
	"https://upload.wikimedia.org/wikipedia/commons/f/f4/Alea_6.png",
];
