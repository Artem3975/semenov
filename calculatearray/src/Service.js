import axios from "axios";

const API_URL = "http://localhost:8080/calc/calculateget";
const headers = {
    "Content-Type": "application/json"
};
class Service {


    calculate() {
        return axios.post(API_URL, {
            size: 1,
            start: 2,
            finish: 3,
            type: 3,
            precision: 4,
            operation: 5
        });
    }
    calculateget(size,start,finish,type,precision,operation,typeArray,typeVarFloat,typeVarInt) {
        return axios.post(API_URL, {
            size: size,
            start: start,
            finish: finish,
            type: type,
            precision: precision,
            typeArray: typeArray,
            typeVarFloat: typeVarFloat,
            typeVarInt: typeVarInt,
            operation: operation
        });
    }

}

export default new Service();