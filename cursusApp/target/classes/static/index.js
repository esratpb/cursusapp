 function getAllCursuses(){
        $.ajax({
            url:'http://localhost:8080/api/cursuses',
            type: 'GET',
            contentType:'application/json',
            dataType: "json",
            crossDomain: true
        }).done(function(data){
            cursusListSuccess(data);
        });
    };
 function cursusListSuccess(cursuses){
        $.each(cursuses,function(index,cursus){
            cursusAddRow(cursus);
        });
    };


    function cursusAddRow(cursus){
        if ($("#cursusTable tbody").length==0){
            $("#cursusTable").append("<tbody></tbody>");
        }

        $("#cursusTable tbody").append(cursusBuildTableRow(cursus));
    };


    function cursusBuildTableRow(cursus){

        var ret= "<tr>"+"<td>"+cursus.Id+"</td>"
        +"<td>"+cursus.name+"</td>"
        +"<td>"+cursus.level+"</td>"
        +"<td>"+cursus.teacher+"</td>"
        +"<td>"+cursus.firstDay+"</td>"
        +"<td>"+cursus.lastDay+"</td>"
        +"<td>"+cursus.status+"</td>"+"</tr>";


        
        return ret;
    }



