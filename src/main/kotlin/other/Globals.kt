package other

import java.text.SimpleDateFormat
import java.util.*

fun commonAnnotation(provider: ArmsPluginTemplateProviderImpl) = """
/**
 * Created on ${SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date(System.currentTimeMillis()))}
 * @author blankm 
 * module name is ${provider.pageName.value}${if(provider.needActivity.value) "Activity" else "Fragment"}
 */
""".trimIndent()

val armsAnnotation = """
/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on ${SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date(System.currentTimeMillis()))}
 * ================================================
 */
""".trimIndent()