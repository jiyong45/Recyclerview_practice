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


ScrollView 와 RecyclerView 차이점 

ScrollView 의 경우 가시성(?)에 관계없이 모든 하위 보기가 한번에 생성 

RecyclerView 자식뷰가 자동으로 표시될 때까지의 생성을 연기 하고 공통 레이아웃으로 자식 뷰를 재사용 할 수 있다는 이점을 제공(?)


// RecyclerView 의 재사용성에 대한 부분
ListView의 경우 100개의 목록이 있다면 100개를 그냥 로드해둔채로 계속 사용하는것.

RecyclerView의 경우 100개가 있어도 화면에 보이는것이 8개라면 대략 10개정도를 로드하였다 쳤을때 
스크롤을 위로 올렸을대 곧 사라질 뷰 객체를 삭제하지 않고 맨 아래로 내려 새로운 객체를 바꿔끼워주는 형태로 사용됨... 갱신되는것 새로 생성하는 것이 아닌 갈아끼운다의 개념


###########################################################################################################################


RecyclerView의 ItemDecoration 으로 구분선을 사용해보자...

ItemDecoration의 경우 3개의 함수를 기본적으로 제공함

getItemOffsets // 이건 더이상 사용이 안됨

onDraw  - 컨텐츠가 그려지기 전에 그려지므로 보기 아래에 나타남 


onDrawOver - onDrawOver의 경우 컨텐츠의 항목들이 다 그려지고 맨 마지막에 그려져서 보기 위에 표시됨





