import config from '../utils/config.js';
import {handleHttpStatus} from '../utils/handle-http-status.js';

const urlBackend = (config.amb === 'dev') ? config.links.urlBackendDev : config.links.urlBackend;
const carResource = config.resources.car;

class CarService {

    async getAllCars() {
        const response = await $.ajax({
            url: urlBackend + carResource,
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
                'Accept': 'application/json, text/javascript, */*; q=0.01',
            },

            type: "GET",
            crossDomain: true,
            dataType: "json"
        }).then(function (resp, status, code) {
            handleHttpStatus(code.status, '')
            return resp;
        }).catch(function (code) {
            handleHttpStatus(code.status,'')
        });

        return response;
    }
}

export default CarService;