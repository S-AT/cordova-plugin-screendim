(function (gap, w) {
    // dims by default
    var on = true;
    
    var screenDim = { };
    
    if(gap) {

        screenDim.enable = function () {
            on = true;
            gap.exec(null, null, 'ScreenDim', 'enable', []);
        };

        screenDim.disable = function () {
            on = false;
            gap.exec(null, null, 'ScreenDim', 'disable', []);
        };

        screenDim.toggle = function () {
            if (on) {
                this.disable();
            } else {
                this.enable();
            }
        };
        
        gap.screenDim = screenDim;
    }
    else {
        screenDim.enable = function(){};
        screenDim.disable = screenDim.enable;
        screenDim.toggle = screenDim.enable;
    }
    
    if(!w.screenDim) {
        w.screenDim = screenDim;
    }
    
}).call(this, (window.cordova || window.Cordova), window);
