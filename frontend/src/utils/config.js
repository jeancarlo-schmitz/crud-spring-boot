 const config = {
     resources: {
         car: "car/",
         brand: "brand/",
         categoryType: "category-type/",
     },
     links: {
         urlBackend: 'non-exists =D',
         urlBackendDev: 'http://localhost:8080/api/',       
     },
     defaultSystem: {
        divNoResultsFound: '#no-results-found',
        divIdLoading: '#loading'
     }
 };

if (location.hostname === "localhost" || location.hostname === "127.0.0.1"){
    config.amb = 'dev';
}

 export default config;