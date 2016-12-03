/*
var app = (function(){
    var init = function(){};
    return {init:init}
})();
*/
var app = (function(){
    var init = function(){
        add.init();
    };
    var second = function(){};
    return {
        init:init
        second:second,
        third:funo
    }
})();
