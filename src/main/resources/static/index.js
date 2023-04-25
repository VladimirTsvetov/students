angular.module('app',[]).controller('indexController',function($scope,$http){
    const contextPath = 'http://localhost:8080/app/api/v1';

    $scope.fillTable = function(){
        $http.get(contextPath + '/students')
        .then(function(response){
            $scope.StudentList = response.data;
        });

    };
    $scope.deleteStudent = function(studentId){
        $http.delete(contextPath + '/students/' + studentId)
             .then(function(response){
                $scope.fillTable();
        });
    }


    $scope.addNewStudent = function(studentDto){

            $http.post(contextPath + '/students',$scope.studentDto)
            .then(function(response){
                    $scope.fillTable();
            });
    }

    $scope.fillTable();

});