import CarController from '/src/controller/CarController.js';
import carHelper from '/src/helpers/CarHelper.js';
const $app = {};

const carController = new CarController();

$app.editCar = function (carId){
    carController.editCar(carId);
}

$app.deleteCar = function (carId){
    carController.deleteCar(carId);
}

$(document).ready(function () {
    carController.getAllCars();
});

window.app = $app;