import BrandService from '../service/BrandService.js';

class BrandController {
    constructor() {
        this.brandService = new BrandService();
    }

    findAll(){
        return this.brandService.findAll();
    }
}

export default BrandController;