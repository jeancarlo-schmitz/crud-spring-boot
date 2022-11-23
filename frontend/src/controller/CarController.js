import CarService from '../service/CarService.js';
import CategoryTypeController from '../controller/CategoryTypeController.js';
import BrandController from '../controller/BrandController.js';
import carHelper from '../helpers/CarHelper.js';
import {sendMenssage} from '../utils/alerts.js';
import config from '../utils/config.js';
import loading from '../utils/loading.js';

class CarController {
    constructor() {
        this.carService = new CarService();
        this.brandController = new BrandController();
        this.categoryTypeController = new CategoryTypeController();
    }
    
    async editCar(carId){
        loading(true);

        let carDetail = await this.carService.findCarById(carId);
        let categoryTypeList = await this.categoryTypeController.findAll();
        let brandList = await this.brandController.findAll();
        await carHelper.buildModalEditCar(carDetail, categoryTypeList, brandList);
        carHelper.showModalEditCar();

        loading(false);
    }

    deleteCar(carId){

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