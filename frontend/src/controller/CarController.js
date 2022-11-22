import CarService from '../service/CarService.js';
import carHelper from '../helpers/CarHelper.js';
import {sendMenssage} from '../utils/alerts.js';
import config from '../utils/config.js';
import loading from '../utils/loading.js';

class CarController {
    constructor() {
        this.carService = new CarService();
    }
    
    async editCar(){
        let carDetail = await this.carService.findCarById();
    }

    deleteCar(){

    }

    async getAllCars(){
        loading(true);

        this.hideNoResultsFound();
        let carsList = await this.carService.getAllCars();
        this.verifyIfBuildCarListInScreen(carsList);

        loading(false);
    }

    verifyIfBuildCarListInScreen(carsList){
        if(this.isObjectNotEmpty(carsList)){
            carHelper.buildCarListInScreen(carsList);
        }else{
            this.showNoResultsFound();
        }
    }

    isObjectNotEmpty(carsList){
        return carsList !== undefined && carsList.length > 0;
    }

    showNoResultsFound(){
        $(config.defaultSystem.divNoResultsFound).show();
    }

    hideNoResultsFound(){
        $(config.defaultSystem.divNoResultsFound).hide();
    }
}

export default CarController;