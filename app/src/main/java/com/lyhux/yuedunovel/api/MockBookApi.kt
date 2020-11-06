package com.lyhux.yuedunovel.api

import com.google.gson.JsonObject
import com.lyhux.yuedunovel.data.BookBean
import com.lyhux.yuedunovel.data.ChapterBean
import com.lyhux.yuedunovel.data.UserBean
import com.lyhux.yuedunovel.data.http.ApiResponse
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import retrofit2.Call

class MockBookApi : BookApi {

    override fun loginAsync(name: String, password: String): Deferred<ApiResponse<UserBean>> {
        return GlobalScope.async {
            // You have to wrap manually your result before return
            ApiResponse<UserBean>(1, "操作成功", UserBean("hello", "icon", "ttt"))
        }
    }

    override fun categoryAsync(id: String, page: Int): Deferred<ApiResponse<List<BookBean>>> {
        TODO("Not yet implemented")
    }

    override fun bookDetailAsync(id: String): Deferred<ApiResponse<BookBean>> {
        return GlobalScope.async {
            ApiResponse<BookBean>(1,
                    "操作成功",
                    BookBean(
                            "hello",
                            "icon",
                            "ttt"
                    )
            )
        }
    }

    override fun bookChapterListAsync(id: String): Deferred<ApiResponse<List<String>>> {
        return GlobalScope.async {
            ApiResponse<List<String>>(1,
                    "操作成功",

                    listOf("item 1", "item 2 ", "list", "android", "item 3", "foobar", "bar")
            )
        }
    }

    override fun bookChapterAsync(bookId: String, chapterId: String): Deferred<ApiResponse<ChapterBean>> {
        return GlobalScope.async {
            ApiResponse<ChapterBean>(1,
                    "操作成功",

                    ChapterBean(
                            bookId,
                            "第二章 青牛镇",
                            "  这是一个小城，说是小城其实只是一个大点的镇子，名字也叫青牛镇，只有那些住在附近山沟里、没啥见识的土人，才“青牛城”“青牛城”的叫个不停。这是干了十几年门丁张二的心里话。    青牛镇的确不大，主街道只有一条东西方向的青牛街，连客栈也只有一家青牛客栈，客栈坐落在长条形状的镇子的西端，所以过往的商客不想露宿野外的话，也只能住在这里。    现在有一辆一看就是赶了不少路的马车，从西边驶入青牛镇，飞快的驶过青牛客栈的大门前，停都不停，一直飞驰到镇子的另一端，春香酒楼的门口前，才停了下来。    春香酒楼不算大，甚至还有些陈旧，但却有一种古色古香的韵味。因为现在正是午饭时分，酒楼里用饭的客人还很多，几乎称的上是座无虚席。    从车上下来一个圆脸带着小胡子的胖男子和一个皮肤黝黑的、十来岁的小孩，男子带着孩童直接就大摇大摆地进了酒楼。有酒楼里的熟客认得胖子，知道他是这个酒楼的掌柜“韩胖子”，那个小孩是谁却无人认得。    “老韩，这个黑小子长的和你很像，不会是你背着家里婆娘生的儿子吧。”有个人突然打趣道。    这句话一出，惹的旁边的众人人哈哈一阵大笑。    “呸！这是我本家带来的亲侄子，当然和我有几分像了。”胖子不但没生气，还有几分得意。    这二人正是一连赶了三天路，才刚进镇子的韩立和他的三叔别人口中的“韩胖子”。    韩胖子招呼了几位熟客一声，便把韩立带到酒楼后面，来到了一个偏僻小院子里。    “小立，你在这屋里好好休息下，养好精神，等内门的管事一来，我就叫你过去，我要先出去一下，招呼几位熟客。”韩胖子指着院里的厢房，和蔼的对他说道。    说完，便转身匆忙地向外走去。    到门口时，他似乎心里又有些不太放心，又嘱咐了一句。    “别乱跑啊，镇子里人太多，别走丢了，最好别出院子。”    “恩！”    看到韩立老实的答应了一声，他才真正放心的走了出去。    韩立见到三叔走出了屋子，感到很累，便一头倒到床上呼呼的睡了起来，竟然没有一点小孩子怕生的感觉。    到晚上，有个小厮送来了饭菜，虽然不是大鱼大肉，倒也算是可口。吃完后，一小厮又走了进来，把吃剩饭碗给端了出去，这时三叔才不慌不忙的走了进来。    “怎么样，饭菜还合你胃口吧，有些想家了吧？”    “恩，有点想了。”韩立显的很乖巧。    三叔看起来对韩立的回答很满意，紧接着和他聊起了一些家常便话，吹嘘一些自己经历过的趣人趣事。渐渐的，韩立没有了拘束感，和他也开始有说有笑起来。    就这样，一连过了两天。    第三天，当韩立吃完晚饭，正等三叔来给他讲江湖故事时，又有一辆马车停到了酒楼门前。    这辆马车通体被黑漆刷的乌黑发亮，驾车的也是不常见的百里挑一的黄骠骏马，最惹人注意的是，在马车边框上插着一面锈着“玄”字的小三角黑旗，银字红边，自然的透着一股说不出的神秘色彩。    看到这面小旗，凡是在这方圆数百里走动的江湖老手都知道，这片地方的两大霸主之一的“七玄门”，有重要人物驾临本地了。    “七玄门”又叫“七绝门”，由二百年前赫赫有名的“七绝上人”所创立，曾一度雄霸镜州数十载，甚至还渗透过与镜州相近的数州，在整个越国也声名赫赫过。但自从“七绝上人”病故后，“七玄门”势力就一落千丈，被其他门派联手挤出了镜州首府镜州城。百年前，宗门被迫搬迁到镜州最偏僻的地方——仙霞山，从此在处生根落户，落为三流地方小势力。    有句话说的好瘦死的骆驼比马大，七玄门毕竟曾经是个大门派，拥有的潜力还是非同小可。来到彩霞山这个地方，立刻便控制住包括“青牛镇”在内的十几个小城镇，拥有门下弟子三四千人，是本地名附其实的两大霸主之一。    本地唯一能和七玄门抗衡的另一股势力是“野狼帮”。    野狼帮前身是镜州界内一股烧杀掳掠的马贼，后来几经官府围剿，一部分接受了官府招安，另一部分马贼便成了野狼帮，但是马贼凶狠嗜血、敢杀敢拼的狠劲却一并传了下来，因此七玄门在和野狼帮次冲突时屡屡处在了下风。    野狼帮控制的乡镇虽然比较多，但不会经营，论富足程度远远及不上七玄门旗下的城镇。野狼帮十分眼馋七玄门下的几个较富裕的地盘，最近经常挑起两者之间的冲突，这令现任的七玄门门主头疼不已，这也成为了七玄门近年来一再扩招门内弟子的主要原因。    马车上跳下一名四十多岁的瘦削汉子，这名汉子动作敏捷，明显身手不弱，对这里似乎也很熟悉，大踏步直奔韩理所在的屋子走去。    韩立三叔一见这人，立刻恭恭敬敬的上前施了一个礼。    “王护法，您老人家怎吗亲自带人来了？”    “哼！”王护法冷哼了一声，一脸的傲色。    “这段时间路上不太平，要加强防卫，长老命我亲自来领人，废话少说，这个小孩就是你要推举的人？”    “是的，是的，这是我本家的亲侄子，还望王护法路上多照应一下。”    韩胖子看到这汉子神色有些不耐烦，麻利的从身上取出个沉甸甸的袋子隐秘的递了过去    王护法掂了掂袋子，神色有些缓松了下来。    “韩胖子，你挺会做人吗！你侄子我路上自会照顾一二的，时间不早了，还是赶紧上路吧。”\n"
                    )
            )
        }
    }

    override fun jsonAsync(params: LoginParams): Deferred<ApiResponse<UserBean>> {
        return GlobalScope.async {
            // You have to wrap manually your result before return
            ApiResponse<UserBean>(1, "操作成功", UserBean("world", "icon", "ttt"))
        }
    }
}