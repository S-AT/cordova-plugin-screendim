var exec = require("cordova/exec");

module.exports = {
    on: true,
    
    enable: function () {
        this.on = true;
        exec(null, null, 'ScreenDim', 'enable', []);
    },

    disable: function () {
        this.on = false;
        exec(null, null, 'ScreenDim', 'disable', []);
    },

    toggle: function () {
        if (this.on) {
            this.disable();
        } else {
            this.enable();
        }
    },
    
};
