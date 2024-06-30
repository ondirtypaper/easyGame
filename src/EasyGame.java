public class EasyGame {
    private static final int versionNo = 0;
    private static final int merged = 0;
    private static final int systemVersion = 1;
    private static final int gameLogicVersion = 0;
    private static final int dataStructureVersion =  0;
    private static final int graphicLibraryVersion = 0;

    private enum status{
        COMPLETE,
        TESTING,
        DEBUGGING,
        JUST_MERGED,
        SCATTERED,
    }

    public static void main(String[] args) {

        printProjectStatus(status.COMPLETE);
        new EasyFrame();

    }
    /**
     * 프로젝트 형상 관리를 위한 console 출력 method
     * @date 6,30 20:35
     * @param currentStatus 프로젝트 현재 상태
     * @author SungBae-Kang (Code : Easy)
     */
    public static void printProjectStatus(status currentStatus){

        System.out.println("##################################################");
        System.out.println("#########  Welcome to Easy Swing. ################");
        System.out.println("##################################################");
        System.out.println("## Easy Swing 에 오신 것을 환영하네. 친구들. #########");
        System.out.printf("## 현재 Version number는 %1d.%2d%2d%2d%2d%2d\t##########\n",
                versionNo, merged, systemVersion, gameLogicVersion, dataStructureVersion, graphicLibraryVersion);
        System.out.print("## 상태는 ");
        switch(currentStatus){
            case COMPLETE:
                System.out.print("COMPLETE : [ 버전 완성 ] "); break;
            case TESTING:
                System.out.print("TESTING : [ 테스트 중 ] "); break;
            case DEBUGGING:
                System.out.print("DEBUGGING : [ 버그 수정 중 ] "); break;
            case JUST_MERGED:
                System.out.print("JUST_MERGED : [ 병합 직후 ] "); break;
            case SCATTERED:
                System.out.print("SCATTERED : [ 각자 개발 중 ] "); break;
            default:
                System.out.print("[ 알 수 없음 ] "); break;
        }
        System.out.println("이네. 화이팅!!\t##");
        System.out.println("##################################################");
    }
}
