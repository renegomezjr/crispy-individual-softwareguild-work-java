/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $('#getRandomAnimal').click(function(event){
       event.preventDefault();
       $.ajax({
          url: 'randomAnimal',
          type: 'GET',
          headers:{
              'Accept':'text/plain'
          }
      }).success(function(data, status){
          //this is a callback
          $('#animal').html(data);
      });
    });
    
    $('#getRandomNumber').click(function(event){
        event.preventDefault();
        $.ajax({
            url: 'randomNumber',
            type: 'GET',
            headers:{
                'Accept':'application/json'
            }
        }).success(function(data, status){
           $('#randomNumber').text(data);
        });
    });
    
    $('#compliment-btn').click(function(event){
       event.preventDefault();
       $.ajax({
           url:'compliment',
           type:'POST',
           data:$('#compliment-name').val(),
           headers:{
               'Accept':'text/plain',
               'Content-Type':'text/plain'
           },
           'data-Type':'text/plain'
       }).success(function(data, status){
           $('#compliment').text(data);
       });
    });
    
    $('#randomDiceRoll').click(function(event){
        event.preventDefault();
        $.ajax({
            url:'dieRoll/sides/' + $('#number').val(),
            type:'POST',
            data:$('#number').val(),
            headers: {
                'Accept':'application/json',
                'Content-Type':'text/plain'
            },
            'data-Type':'text/plain'
        }).success(function(data, status){
           $('#dieNum').text(data); 
        });
    });
});

