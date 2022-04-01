# Recyclerview_practice

ListView 
장점
1. 간단히 List를 만드는 부분에 있어서는 쉬운 장점(텍스트만 있는 리스트 한정)
2. 간단한 아이템 형태를 만드는 경우에는 빠르게 적용 가능한 ArrayAdapter(나중에 확인해보기)를 제공한다.

//아직은 무슨의미인지 모르는 부분
3. ListView 의 경우 getView? 재사용성이 떨어짐 > 스크롤시에 getView 함수가 계속 호출되어 비효율적이다
4. List의 특성상 View가 하나 있을때 이거로 연속적으로 사용이 가능하면 좋은데 ListView는 이러한것이 강제가 불가능한 형태라서 힘든점이있다.
5. inflate + findViewById를 사용하는 경우 ListView에서 연속적으로 발생시키게되면 메모리와 성능에 문제가 악영항이 생기기때문에 좋지않다.
6. ViewHolder 패턴을 사용하면 좋긴하나 여러 ViewHolder 를 만들어야 하기때문에 좋지가 않다. 

단점
1. 아이템의 애니메이션 처리가 어려움
2. List에는 한개이상의 View가 필요하지만 커스텀작업이 쉽지않음
3.ViewHolder 패턴을 강제사용이 적기에 고비용의 findViewById를 매번 호출가능성이 있음..


//아직 더 봐야함
RecyclerView
ListView와 가장큰 차이점은 LayoutManaget(?)와 ViewHolder 패턴의 의무적인 사용
하위 아이템의 View의 변형 및 애니메이션 개념이 추가된것
ViewHolder의 적용으로 View의 재사용이 가능


1.Click 이벤트에 대한 처리를 자체적으로 할수 없어 onClickListener를 달아줘야함
2.Item Animator 라는걸 사용하여 item들의 애니메이션을 커스터마이징이 가능하고 기본애니메이터도 제공됨
3.LayoutManager 라는게 사용이 가능한데 ListView에서 수직 스크롤이 가능하지만 가로,세로, grid형태 등 여러가지 방법으로 표현 가능
4.ViewHolder 패턴이 권장이 아닌 강제하여 findViewById의 호출을 한번만 하여 무거운연산 해결

