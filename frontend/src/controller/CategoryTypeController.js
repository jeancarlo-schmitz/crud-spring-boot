import CategoryTypeService from '../service/CategoryTypeService.js';

class CategoryTypeController {
    constructor() {
        this.categoryTypeService = new CategoryTypeService();
    }

    findAll(){
        return this.categoryTypeService.findAll();
    }
}

export default CategoryTypeController;