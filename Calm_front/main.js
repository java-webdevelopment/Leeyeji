const toggleBtn = document.querySelector('#menuicon')
//toggleBtn이라는 변수 만들고 html에서 .menu_button이라는 클래스 찾아서 대입
const menu = document.querySelector('.nav_menu')

toggleBtn.addEventListener('click', () => {
    //이벤트 처리 api. 이 변수가 클릭 될 때마다 이 함수를 호출해줘.
   menu.classList.toggle('active');
    //메뉴와 아이콘 클래스에 액티브 클래스를 토글링
    //마우스로 각각을 클릭했을 때 active가 있으면 빼주고
    //없으면 추가해주는 역할을 함
});

