import io.github.wulkanowy.messages.pojo.AppFlavor
import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessagePriority
import io.github.wulkanowy.messages.pojo.MessageType

val messages = listOf(
    Message(
        id = 4,
        title = "Problemy z VULCANem",
        content = "Logowanie do dziennika przestało działać, dlatego musimy zakończyć działalność.",
        priority = MessagePriority.LOW,
        targetFlavor = AppFlavor.PLAY,
        versionMin = 98,
        versionMax = 98,
        type = MessageType.DASHBOARD_MESSAGE,
    ),
    Message(
        id = 3,
        title = "Problemy z VULCANem",
        content = "Przez błąd w systemie UONET+ (potwierdzony przez firmę VULCAN) u niektórych zadania pojawiają się dopiero w dniu terminu ich oddania. W tym czasie prosimy o uważne sprawdzanie zadań w różnych źródłach i prosimy o cierpliwość!",
        targetRegisterHost = "fakelog.cf",
        priority = MessagePriority.HIGH,
        versionMax = 98,
        versionMin = 97,
        type = MessageType.DASHBOARD_MESSAGE,
    ),
    Message(
        id = 2,
        title = "Problemy z Fakelogiem",
        content = "Przez błąd w systemie UONET+ (potwierdzony przez firmę VULCAN) u niektórych zadania pojawiają się dopiero w dniu terminu ich oddania. W tym czasie prosimy o uważne sprawdzanie zadań w różnych źródłach i prosimy o cierpliwość!",
        targetRegisterHost = "fakelog.cf",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
    ),
    Message(
        id = 1,
        title = "Problemy z planem lekcji",
        content = "Ostatnia aktualizacja dziennika VULCAN UONET+ spowodowała problemy z ładowaniem planu lekcji. Nie ma to nic wspólnego z naszą aplikacją. Prosimy o cierpliwość do czasu, aż VULCAN rozwiąże ten problem po swojej stronie",
        type = MessageType.DASHBOARD_MESSAGE,
    ),
)
