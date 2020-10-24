$('#one, #two').blur(function() {
    let btn = $('#enter')
    if($('#one').val() == '' || $('#two').val() == '') {
        btn.prop('disabled', true);
    } else {
        btn.prop('disabled', false);
    }
 });