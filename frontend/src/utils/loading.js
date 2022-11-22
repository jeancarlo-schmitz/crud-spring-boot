import config from '../utils/config.js';

export default function (ativaDesativa) {
    var loading = document.querySelector(config.defaultSystem.divIdLoading);
    if (loading !== null) {
        if (ativaDesativa === true) {
            loading.style.display = 'block';
        } else {
            loading.style.display = 'none';
        }
    }
}