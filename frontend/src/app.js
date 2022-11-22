import CarController from '/src/controller/CarController.js';
import carHelper from '/src/helpers/CarHelper.js';

const carController = new CarController();

const teste = $('#teste');
if (teste !== null) {
    teste.click(() => {
        console.log("AQUIII343424234");
        // carController.teste();
    });
}


$(document).ready(async function () {
    await carController.getAllCars();

    const editCar = $('.editCar');
    if (editCar !== null) {
        editCar.click(() => {
            console.log(editCar);
            let idCar = carHelper.getIdCar(editCar);
            console.log(idCar);
            // carController.editCar();
        });
    }
});